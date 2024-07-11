### git 저장소 연결하기


#### 1. 기존 폴더를 Git 저장소로 초기화 (이미 Git 저장소인 경우 생략)
- git init


#### 2. 원격 저장소 추가
- git remote add origin <원격 저장소 URL>


#### 3. 원격 저장소에서 최신 내용 가져오기
- git fetch origin


#### 4. 원격 저장소의 내용을 로컬 폴더에 덮어쓰기 (master 브랜치 사용)
- git reset --hard origin/master


#### 5. 현재 상태 확인
- git status


#### 6. 로그 확인
- git log --oneline




### 로컬 저장소에서 원격 저장소에 올리기

1. git add로 staging area에 올린다
2. git commit으로 로컬 저장소에 저장한다(커밋 메세지 포함)
3. git pull(원격 저장소에 자신의 저장내용을 올리기 전에 원격저장소에 있는 내용을 받아옴)
4. git push(로컬저장소(자신의 컴퓨터)에 있는 내용을 저장함)


#### 1. 로컬  저장소의 내용을 추가 staging area에 올림
- git add .
- 이 때 git status로 본인이 올릴 파일 목록을 확인
- staging area에 올라간 목록을 초기화하고 싶다면 git reset


#### 2. 로컬 저장소에 저장할 소스를 진짜 저장한다
- git commit -m "원하는 메세지"
- 자신의 컴퓨터의 내용을 기록함


#### 3. 원격 저장소의 저장내용을 받아온다
- git pull
- conflict가 나면 해당 파일을 확인해서 꺽쇄안에 내용을 비교해서 저장하고 로컬 저장소에 저장


#### 4. 원격 저장소에 로컬 저장소의 내용을 저장한다
- git push