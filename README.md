## LV0 AWS Budget 설정

![AWS Budgets Config.png](img/AWS%20Budgets%20Config.png)

---

## LV1 배포 정보

EC2 Public IP: 3.36.99.11

Health Check:
http://3.36.99.11:8080/actuator/health

---

## LV2 DB분리 및 보안 연결하기

1. Actuator Info 엔드포인트 URL
http://3.36.99.11:8080/actuator/info
2. RDS 보안 그룹 스크린샷
![RDS 보안 그룹 스크린샷.png](img/RDS%20%E1%84%87%E1%85%A9%E1%84%8B%E1%85%A1%E1%86%AB%20%E1%84%80%E1%85%B3%E1%84%85%E1%85%AE%E1%86%B8%20%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA.png)