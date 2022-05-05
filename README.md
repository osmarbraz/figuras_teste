[![Github Actions Status for osmarbraz/figura_teste](https://github.com/osmarbraz/figura_teste/workflows/Build/badge.svg)](https://github.com/osmar/figura_teste/actions) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_figuras_teste&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=osmarbraz_figuras_teste)

# Exemplo de Pipeline de CI.

Utiliza 3 ambientes:
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção

Pipeline 
- dev - Compilação 
- hmg - Compilação, Testes, Análise Código, Cobertura Código
- prd - Empacotamento

