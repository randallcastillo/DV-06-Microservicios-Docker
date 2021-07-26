FROM python:3.7.11-alpine
EXPOSE 80
COPY ./app /app
RUN pip install fastapi uvicorn
CMD ["uvicorn", "app.main:app", "--host", "0.0.0.0", "--port", "80"]
