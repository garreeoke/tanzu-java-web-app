load('.tanzu/tanzu_tilt_extensions.py', 'tanzu_k8s_yaml')


SOURCE_IMAGE = os.getenv("SOURCE_IMAGE", default='gcr.io/taaron-1/tanzu-java-web-app-source')
LOCAL_PATH = os.getenv("LOCAL_PATH", default='.')

custom_build('gcr.io/taaron-1/tanzu-java-web-app',
    "tanzu apps workload apply -f config/workload.yaml --live-update \
      --local-path " + LOCAL_PATH + " --source-image " + SOURCE_IMAGE + " --yes && \
    .tanzu/wait.sh tanzu-java-web-app",
  ['pom.xml', './target/classes'],
  live_update = [
    sync('./target/classes', '/workspace/BOOT-INF/classes')
  ],
  skips_local_docker=True
)

tanzu_k8s_yaml('tanzu-java-web-app', 'gcr.io/taaron-1/tanzu-java-web-app', './config/workload.yaml')
allow_k8s_contexts('gke_taaron-1_us-west1-a_tap-beta2-2')
