// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataflow.v1b3.outputs.WorkerSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TaskRunnerSettingsResponse {
    /**
     * @return Whether to also send taskrunner log info to stderr.
     * 
     */
    private Boolean alsologtostderr;
    /**
     * @return The location on the worker for task-specific subdirectories.
     * 
     */
    private String baseTaskDir;
    /**
     * @return The base URL for the taskrunner to use when accessing Google Cloud APIs. When workers access Google Cloud APIs, they logically do so via relative URLs. If this field is specified, it supplies the base URL to use for resolving these relative URLs. The normative algorithm used is defined by RFC 1808, &#34;Relative Uniform Resource Locators&#34;. If not specified, the default value is &#34;http://www.googleapis.com/&#34;
     * 
     */
    private String baseUrl;
    /**
     * @return The file to store preprocessing commands in.
     * 
     */
    private String commandlinesFileName;
    /**
     * @return Whether to continue taskrunner if an exception is hit.
     * 
     */
    private Boolean continueOnException;
    /**
     * @return The API version of endpoint, e.g. &#34;v1b3&#34;
     * 
     */
    private String dataflowApiVersion;
    /**
     * @return The command to launch the worker harness.
     * 
     */
    private String harnessCommand;
    /**
     * @return The suggested backend language.
     * 
     */
    private String languageHint;
    /**
     * @return The directory on the VM to store logs.
     * 
     */
    private String logDir;
    /**
     * @return Whether to send taskrunner log info to Google Compute Engine VM serial console.
     * 
     */
    private Boolean logToSerialconsole;
    /**
     * @return Indicates where to put logs. If this is not specified, the logs will not be uploaded. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    private String logUploadLocation;
    /**
     * @return The OAuth2 scopes to be requested by the taskrunner in order to access the Cloud Dataflow API.
     * 
     */
    private List<String> oauthScopes;
    /**
     * @return The settings to pass to the parallel worker harness.
     * 
     */
    private WorkerSettingsResponse parallelWorkerSettings;
    /**
     * @return The streaming worker main class name.
     * 
     */
    private String streamingWorkerMainClass;
    /**
     * @return The UNIX group ID on the worker VM to use for tasks launched by taskrunner; e.g. &#34;wheel&#34;.
     * 
     */
    private String taskGroup;
    /**
     * @return The UNIX user ID on the worker VM to use for tasks launched by taskrunner; e.g. &#34;root&#34;.
     * 
     */
    private String taskUser;
    /**
     * @return The prefix of the resources the taskrunner should use for temporary storage. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    private String tempStoragePrefix;
    /**
     * @return The ID string of the VM.
     * 
     */
    private String vmId;
    /**
     * @return The file to store the workflow in.
     * 
     */
    private String workflowFileName;

    private TaskRunnerSettingsResponse() {}
    /**
     * @return Whether to also send taskrunner log info to stderr.
     * 
     */
    public Boolean alsologtostderr() {
        return this.alsologtostderr;
    }
    /**
     * @return The location on the worker for task-specific subdirectories.
     * 
     */
    public String baseTaskDir() {
        return this.baseTaskDir;
    }
    /**
     * @return The base URL for the taskrunner to use when accessing Google Cloud APIs. When workers access Google Cloud APIs, they logically do so via relative URLs. If this field is specified, it supplies the base URL to use for resolving these relative URLs. The normative algorithm used is defined by RFC 1808, &#34;Relative Uniform Resource Locators&#34;. If not specified, the default value is &#34;http://www.googleapis.com/&#34;
     * 
     */
    public String baseUrl() {
        return this.baseUrl;
    }
    /**
     * @return The file to store preprocessing commands in.
     * 
     */
    public String commandlinesFileName() {
        return this.commandlinesFileName;
    }
    /**
     * @return Whether to continue taskrunner if an exception is hit.
     * 
     */
    public Boolean continueOnException() {
        return this.continueOnException;
    }
    /**
     * @return The API version of endpoint, e.g. &#34;v1b3&#34;
     * 
     */
    public String dataflowApiVersion() {
        return this.dataflowApiVersion;
    }
    /**
     * @return The command to launch the worker harness.
     * 
     */
    public String harnessCommand() {
        return this.harnessCommand;
    }
    /**
     * @return The suggested backend language.
     * 
     */
    public String languageHint() {
        return this.languageHint;
    }
    /**
     * @return The directory on the VM to store logs.
     * 
     */
    public String logDir() {
        return this.logDir;
    }
    /**
     * @return Whether to send taskrunner log info to Google Compute Engine VM serial console.
     * 
     */
    public Boolean logToSerialconsole() {
        return this.logToSerialconsole;
    }
    /**
     * @return Indicates where to put logs. If this is not specified, the logs will not be uploaded. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    public String logUploadLocation() {
        return this.logUploadLocation;
    }
    /**
     * @return The OAuth2 scopes to be requested by the taskrunner in order to access the Cloud Dataflow API.
     * 
     */
    public List<String> oauthScopes() {
        return this.oauthScopes;
    }
    /**
     * @return The settings to pass to the parallel worker harness.
     * 
     */
    public WorkerSettingsResponse parallelWorkerSettings() {
        return this.parallelWorkerSettings;
    }
    /**
     * @return The streaming worker main class name.
     * 
     */
    public String streamingWorkerMainClass() {
        return this.streamingWorkerMainClass;
    }
    /**
     * @return The UNIX group ID on the worker VM to use for tasks launched by taskrunner; e.g. &#34;wheel&#34;.
     * 
     */
    public String taskGroup() {
        return this.taskGroup;
    }
    /**
     * @return The UNIX user ID on the worker VM to use for tasks launched by taskrunner; e.g. &#34;root&#34;.
     * 
     */
    public String taskUser() {
        return this.taskUser;
    }
    /**
     * @return The prefix of the resources the taskrunner should use for temporary storage. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    public String tempStoragePrefix() {
        return this.tempStoragePrefix;
    }
    /**
     * @return The ID string of the VM.
     * 
     */
    public String vmId() {
        return this.vmId;
    }
    /**
     * @return The file to store the workflow in.
     * 
     */
    public String workflowFileName() {
        return this.workflowFileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskRunnerSettingsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean alsologtostderr;
        private String baseTaskDir;
        private String baseUrl;
        private String commandlinesFileName;
        private Boolean continueOnException;
        private String dataflowApiVersion;
        private String harnessCommand;
        private String languageHint;
        private String logDir;
        private Boolean logToSerialconsole;
        private String logUploadLocation;
        private List<String> oauthScopes;
        private WorkerSettingsResponse parallelWorkerSettings;
        private String streamingWorkerMainClass;
        private String taskGroup;
        private String taskUser;
        private String tempStoragePrefix;
        private String vmId;
        private String workflowFileName;
        public Builder() {}
        public Builder(TaskRunnerSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alsologtostderr = defaults.alsologtostderr;
    	      this.baseTaskDir = defaults.baseTaskDir;
    	      this.baseUrl = defaults.baseUrl;
    	      this.commandlinesFileName = defaults.commandlinesFileName;
    	      this.continueOnException = defaults.continueOnException;
    	      this.dataflowApiVersion = defaults.dataflowApiVersion;
    	      this.harnessCommand = defaults.harnessCommand;
    	      this.languageHint = defaults.languageHint;
    	      this.logDir = defaults.logDir;
    	      this.logToSerialconsole = defaults.logToSerialconsole;
    	      this.logUploadLocation = defaults.logUploadLocation;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.parallelWorkerSettings = defaults.parallelWorkerSettings;
    	      this.streamingWorkerMainClass = defaults.streamingWorkerMainClass;
    	      this.taskGroup = defaults.taskGroup;
    	      this.taskUser = defaults.taskUser;
    	      this.tempStoragePrefix = defaults.tempStoragePrefix;
    	      this.vmId = defaults.vmId;
    	      this.workflowFileName = defaults.workflowFileName;
        }

        @CustomType.Setter
        public Builder alsologtostderr(Boolean alsologtostderr) {
            this.alsologtostderr = Objects.requireNonNull(alsologtostderr);
            return this;
        }
        @CustomType.Setter
        public Builder baseTaskDir(String baseTaskDir) {
            this.baseTaskDir = Objects.requireNonNull(baseTaskDir);
            return this;
        }
        @CustomType.Setter
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }
        @CustomType.Setter
        public Builder commandlinesFileName(String commandlinesFileName) {
            this.commandlinesFileName = Objects.requireNonNull(commandlinesFileName);
            return this;
        }
        @CustomType.Setter
        public Builder continueOnException(Boolean continueOnException) {
            this.continueOnException = Objects.requireNonNull(continueOnException);
            return this;
        }
        @CustomType.Setter
        public Builder dataflowApiVersion(String dataflowApiVersion) {
            this.dataflowApiVersion = Objects.requireNonNull(dataflowApiVersion);
            return this;
        }
        @CustomType.Setter
        public Builder harnessCommand(String harnessCommand) {
            this.harnessCommand = Objects.requireNonNull(harnessCommand);
            return this;
        }
        @CustomType.Setter
        public Builder languageHint(String languageHint) {
            this.languageHint = Objects.requireNonNull(languageHint);
            return this;
        }
        @CustomType.Setter
        public Builder logDir(String logDir) {
            this.logDir = Objects.requireNonNull(logDir);
            return this;
        }
        @CustomType.Setter
        public Builder logToSerialconsole(Boolean logToSerialconsole) {
            this.logToSerialconsole = Objects.requireNonNull(logToSerialconsole);
            return this;
        }
        @CustomType.Setter
        public Builder logUploadLocation(String logUploadLocation) {
            this.logUploadLocation = Objects.requireNonNull(logUploadLocation);
            return this;
        }
        @CustomType.Setter
        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        @CustomType.Setter
        public Builder parallelWorkerSettings(WorkerSettingsResponse parallelWorkerSettings) {
            this.parallelWorkerSettings = Objects.requireNonNull(parallelWorkerSettings);
            return this;
        }
        @CustomType.Setter
        public Builder streamingWorkerMainClass(String streamingWorkerMainClass) {
            this.streamingWorkerMainClass = Objects.requireNonNull(streamingWorkerMainClass);
            return this;
        }
        @CustomType.Setter
        public Builder taskGroup(String taskGroup) {
            this.taskGroup = Objects.requireNonNull(taskGroup);
            return this;
        }
        @CustomType.Setter
        public Builder taskUser(String taskUser) {
            this.taskUser = Objects.requireNonNull(taskUser);
            return this;
        }
        @CustomType.Setter
        public Builder tempStoragePrefix(String tempStoragePrefix) {
            this.tempStoragePrefix = Objects.requireNonNull(tempStoragePrefix);
            return this;
        }
        @CustomType.Setter
        public Builder vmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        @CustomType.Setter
        public Builder workflowFileName(String workflowFileName) {
            this.workflowFileName = Objects.requireNonNull(workflowFileName);
            return this;
        }
        public TaskRunnerSettingsResponse build() {
            final var o = new TaskRunnerSettingsResponse();
            o.alsologtostderr = alsologtostderr;
            o.baseTaskDir = baseTaskDir;
            o.baseUrl = baseUrl;
            o.commandlinesFileName = commandlinesFileName;
            o.continueOnException = continueOnException;
            o.dataflowApiVersion = dataflowApiVersion;
            o.harnessCommand = harnessCommand;
            o.languageHint = languageHint;
            o.logDir = logDir;
            o.logToSerialconsole = logToSerialconsole;
            o.logUploadLocation = logUploadLocation;
            o.oauthScopes = oauthScopes;
            o.parallelWorkerSettings = parallelWorkerSettings;
            o.streamingWorkerMainClass = streamingWorkerMainClass;
            o.taskGroup = taskGroup;
            o.taskUser = taskUser;
            o.tempStoragePrefix = tempStoragePrefix;
            o.vmId = vmId;
            o.workflowFileName = workflowFileName;
            return o;
        }
    }
}