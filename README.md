# Catalog service

Dieser Dienst enthält und liefert auf Anfrage Referenzinformationen. Zur Zeit enthält er Daten für die Region Deutschland. 


**API:**

Derzeit bietet der Berechnungsdienst einen Endpoint an: 
```
method: GET
url: "/region"
request parameter: postcode
```
	
Response: 
```
status: 200
{
    "bundesland": "Nordrhein-Westfalen",
    "postCode": "52070"
}
```

Error-codes:
```
status 500: In allen Fällen, in denen es nicht möglich war, die Prämie zu berechnen
status 404: Wenn die Region nicht über die Postleitzahl gefunden werden konnte
```

**Deployment:**

Dieser Dienst wird standardmäßig auf Port 9090 gestartet. Er ist in der Service-discovery unter dem Namen CATALOG registriert. Aus diesem Grund muss der [Service Discovery Service](https://github.com/AlinaVSorokina/service-discovery)  zuerst gestartet werden. 
