from fastapi import FastAPI

app = FastAPI()

@app.get("/multiplicacion/{numero1}/{numero2}")
async def multiplicacion(numero1: int, numero2: int):
    return numero1 * numero2
