// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.AttestationAuthorityHintArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Note kind that represents a logical attestation &#34;role&#34; or &#34;authority&#34;. For example, an organization might have one `AttestationAuthority` for &#34;QA&#34; and one for &#34;build&#34;. This Note is intended to act strictly as a grouping mechanism for the attached Occurrences (Attestations). This grouping mechanism also provides a security boundary, since IAM ACLs gate the ability for a principle to attach an Occurrence to a given Note. It also provides a single point of lookup to find all attached Attestation Occurrences, even if they don&#39;t all live in the same project.
 * 
 */
public final class AttestationAuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttestationAuthorityArgs Empty = new AttestationAuthorityArgs();

    @Import(name="hint")
    private @Nullable Output<AttestationAuthorityHintArgs> hint;

    public Optional<Output<AttestationAuthorityHintArgs>> hint() {
        return Optional.ofNullable(this.hint);
    }

    private AttestationAuthorityArgs() {}

    private AttestationAuthorityArgs(AttestationAuthorityArgs $) {
        this.hint = $.hint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttestationAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationAuthorityArgs $;

        public Builder() {
            $ = new AttestationAuthorityArgs();
        }

        public Builder(AttestationAuthorityArgs defaults) {
            $ = new AttestationAuthorityArgs(Objects.requireNonNull(defaults));
        }

        public Builder hint(@Nullable Output<AttestationAuthorityHintArgs> hint) {
            $.hint = hint;
            return this;
        }

        public Builder hint(AttestationAuthorityHintArgs hint) {
            return hint(Output.of(hint));
        }

        public AttestationAuthorityArgs build() {
            return $;
        }
    }

}