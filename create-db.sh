docker run --restart always --name weather -e POSTGRES_PASSWORD=password -p 2137:5432 -d postgres:13