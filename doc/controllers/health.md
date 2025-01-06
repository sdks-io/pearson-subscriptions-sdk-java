# Health

```java
HealthController healthController = client.getHealthController();
```

## Class Name

`HealthController`


# Health Check

```java
CompletableFuture<DynamicResponse> healthCheckAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
healthController.healthCheckAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

