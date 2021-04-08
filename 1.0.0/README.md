# 1.0.0
- wigo ai 플랫폼 docker 1.0.0 설치과정
- 1.0 버전에서는 docker hub 를 활용하지 않고 이미지.tar 형태로 ftp 에 관리되기때문에 dockerFile 대신 import 명령과 실행 모듈로 대체   
- 1.0.0 버젼에서는 사전 및 메타정보 데이터가 oracle xe 에 저장 됨
- 이후버전에는 바뀔 에정

# docker image file info
- 

# docker tar image file download
- 기본 메타데이터를 포함한 (oracle) 이미지로 용량이 커서 docker hub 에 올리지 않음 (https://hub.docker.com/)
   - ftp 를 통해서 download
- main 개발서버에 접속
   - 지금은 121번 서버 , 접속정보는 공유 되는 정보를 활용
- /ftp/docker/1.0.0 경로에서 아래 파일 download
   - wigo_engine1.0.0.tar 
   - wigo_data1.0.0.tar
   - wigo_console1.0.0.tar

# docker image create
- 이미지 생성에서는 순서는 상관 없음
- docker import wigo_engine1.0.0.tar wigoai:engine1.0.0
- docker import wigo_console1.0.0.tar wigoai:console1.0.0
- docker import --change 'ENV ORACLE_PWD="oracle"  ORACLE_CHARACTERSET="AL32UTF8"  PATH="/opt/oracle/product/18c/dbhomeXE/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin"  ORACLE_BASE="/opt/oracle"  ORACLE_HOME="/opt/oracle/product/18c/dbhomeXE"  ORACLE_SID="XE"  INSTALL_FILE_1="https://download.oracle.com/otn-pub/otn_software/db-express/oracle-database-xe-18c-1.0-1.x86_64.rpm"  RUN_FILE="runOracle.sh"  PWD_FILE="setPassword.sh"  CONF_FILE="oracle-xe-18c.conf"  CHECK_SPACE_FILE="checkSpace.sh"  CHECK_DB_FILE="checkDBStatus.sh" ' --change 'EXPOSE 1521/tcp' --change 'EXPOSE 5500/tcp' --change 'HEALTHCHECK --interval=1m --start-period=5m CMD "/opt/oracle/checkDBStatus.sh" > /dev/null || exit 1' --change 'CMD ["/bin/sh", "-c", "exec /opt/oracle/runOracle.sh"]' wigo_data1.0.0.tar wigoai:data1.0.0


# docker container 생성
- 부서별 사용자별 환경과 같이 환경분리를 위한 작업이므로 통합 환경을 생성해주는 프로그램과 같이 배포될 예정
- 모듈로 개발되어 배포될 예정