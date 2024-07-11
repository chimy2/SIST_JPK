# 1. 기존 폴더를 Git 저장소로 초기화 (이미 Git 저장소인 경우 생략)
git init

# 2. 원격 저장소 추가
git remote add origin <원격 저장소 URL>

# 3. 원격 저장소에서 최신 내용 가져오기
git fetch origin

# 4. 원격 저장소의 내용을 로컬 폴더에 덮어쓰기 (master 브랜치 사용)
git reset --hard origin/master

# 5. 현재 상태 확인
git status

# 6. 로그 확인
git log --oneline


# 로컬 저장소에서 원격 저장소에 올리기

1. git add로 staging area에 올린다
2. git commit으로 로컬 저장소에 저장한다(커밋 메세지 포함)
3. git pull


# 로컬  저장소의 내용을 추가 staging area에 올림
git add .

# 