# 1.0.0
- wigo ai 플랫폼 docker 1.0.0 설치과정
- 1.0.0 버젼에서는 사전 및 메타정보 데이터가 oracle xe 에 저장 됨
- 이후버전에는 바뀔 에정

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
 - docker import wigo_data1.0.0.tar wigoai:data1.0.0


# docker container 생성
 - 부서별 사용자별 환경과 같이 환경분리를 위한 작업이므로 통합 환경을 생성해주는 프로그램과 같이 배포될 예정
 - 프로그램 개발 및 Dockerfile.xe 생성이 완료되면 작성될 예정