// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SoftwareRecipeStepRunScriptResponse {
    /**
     * @return Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    private List<Integer> allowedExitCodes;
    /**
     * @return The script interpreter to use to run the script. If no interpreter is specified the script is executed directly, which likely only succeed for scripts with [shebang lines](&lt;https://en.wikipedia.org/wiki/Shebang_\(Unix\)&gt;).
     * 
     */
    private String interpreter;
    /**
     * @return The shell script to be executed.
     * 
     */
    private String script;

    private SoftwareRecipeStepRunScriptResponse() {}
    /**
     * @return Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    public List<Integer> allowedExitCodes() {
        return this.allowedExitCodes;
    }
    /**
     * @return The script interpreter to use to run the script. If no interpreter is specified the script is executed directly, which likely only succeed for scripts with [shebang lines](&lt;https://en.wikipedia.org/wiki/Shebang_\(Unix\)&gt;).
     * 
     */
    public String interpreter() {
        return this.interpreter;
    }
    /**
     * @return The shell script to be executed.
     * 
     */
    public String script() {
        return this.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepRunScriptResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> allowedExitCodes;
        private String interpreter;
        private String script;
        public Builder() {}
        public Builder(SoftwareRecipeStepRunScriptResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.interpreter = defaults.interpreter;
    	      this.script = defaults.script;
        }

        @CustomType.Setter
        public Builder allowedExitCodes(List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes);
            return this;
        }
        public Builder allowedExitCodes(Integer... allowedExitCodes) {
            return allowedExitCodes(List.of(allowedExitCodes));
        }
        @CustomType.Setter
        public Builder interpreter(String interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }
        @CustomType.Setter
        public Builder script(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }
        public SoftwareRecipeStepRunScriptResponse build() {
            final var o = new SoftwareRecipeStepRunScriptResponse();
            o.allowedExitCodes = allowedExitCodes;
            o.interpreter = interpreter;
            o.script = script;
            return o;
        }
    }
}