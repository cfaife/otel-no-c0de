FROM openjdk
#FROM docker.pkg.dev.vm.co.mz/openjre-17:2.0.1


COPY --chown=1001 target/quarkus-app/lib /deployments/lib/
COPY --chown=1001 target/quarkus-app/*.jar /deployments/
COPY --chown=1001 target/quarkus-app/app /deployments/app/
COPY --chown=1001 target/quarkus-app/quarkus /deployments/quarkus/

#ENV OTEl_TRACES_EXPORTER=otlp
#ENV OTEl_METRICS_EXPORTER=otlp
#ENV OTEL_EXPORTER_OTLP_TRACES_ENDPOINT = http://otel-collector.svc.local:2000
#ENV OTEL_SERVICE_NAME=division-service
#ENV OTEL_EXPORTER_OTLP_TRACES_ENDPOINT = http://otel-collector:4317
#ENV OTEL_EXPORTER_OTLP_ENDPOINT = http://otel-collector:4317


EXPOSE 8080
USER 1001

ENTRYPOINT ["java","-jar", "/deployments/quarkus-run.jar" ,"-Dquarkus.http.host=0.0.0.0"]