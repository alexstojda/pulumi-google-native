// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.AttestationAuthorityArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.BasisArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.BuildTypeArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.ComplianceNoteArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DSSEAttestationNoteArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DeployableArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DiscoveryArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DocumentNoteArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.FileNoteArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.PackageArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.PackageInfoNoteArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.RelatedUrlArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.RelationshipNoteArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.UpgradeNoteArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.VulnerabilityTypeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final NoteArgs Empty = new NoteArgs();

    /**
     * A note describing an attestation role.
     * 
     */
    @Import(name="attestationAuthority")
    private @Nullable Output<AttestationAuthorityArgs> attestationAuthority;

    /**
     * @return A note describing an attestation role.
     * 
     */
    public Optional<Output<AttestationAuthorityArgs>> attestationAuthority() {
        return Optional.ofNullable(this.attestationAuthority);
    }

    /**
     * A note describing a base image.
     * 
     */
    @Import(name="baseImage")
    private @Nullable Output<BasisArgs> baseImage;

    /**
     * @return A note describing a base image.
     * 
     */
    public Optional<Output<BasisArgs>> baseImage() {
        return Optional.ofNullable(this.baseImage);
    }

    /**
     * Build provenance type for a verifiable build.
     * 
     */
    @Import(name="buildType")
    private @Nullable Output<BuildTypeArgs> buildType;

    /**
     * @return Build provenance type for a verifiable build.
     * 
     */
    public Optional<Output<BuildTypeArgs>> buildType() {
        return Optional.ofNullable(this.buildType);
    }

    /**
     * A note describing a compliance check.
     * 
     */
    @Import(name="compliance")
    private @Nullable Output<ComplianceNoteArgs> compliance;

    /**
     * @return A note describing a compliance check.
     * 
     */
    public Optional<Output<ComplianceNoteArgs>> compliance() {
        return Optional.ofNullable(this.compliance);
    }

    /**
     * A note describing something that can be deployed.
     * 
     */
    @Import(name="deployable")
    private @Nullable Output<DeployableArgs> deployable;

    /**
     * @return A note describing something that can be deployed.
     * 
     */
    public Optional<Output<DeployableArgs>> deployable() {
        return Optional.ofNullable(this.deployable);
    }

    /**
     * A note describing a provider/analysis type.
     * 
     */
    @Import(name="discovery")
    private @Nullable Output<DiscoveryArgs> discovery;

    /**
     * @return A note describing a provider/analysis type.
     * 
     */
    public Optional<Output<DiscoveryArgs>> discovery() {
        return Optional.ofNullable(this.discovery);
    }

    /**
     * A note describing a dsse attestation note.
     * 
     */
    @Import(name="dsseAttestation")
    private @Nullable Output<DSSEAttestationNoteArgs> dsseAttestation;

    /**
     * @return A note describing a dsse attestation note.
     * 
     */
    public Optional<Output<DSSEAttestationNoteArgs>> dsseAttestation() {
        return Optional.ofNullable(this.dsseAttestation);
    }

    /**
     * Time of expiration for this note, null if note does not expire.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return Time of expiration for this note, null if note does not expire.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * A detailed description of this `Note`.
     * 
     */
    @Import(name="longDescription")
    private @Nullable Output<String> longDescription;

    /**
     * @return A detailed description of this `Note`.
     * 
     */
    public Optional<Output<String>> longDescription() {
        return Optional.ofNullable(this.longDescription);
    }

    /**
     * The name of the note in the form &#34;projects/{provider_project_id}/notes/{NOTE_ID}&#34;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the note in the form &#34;projects/{provider_project_id}/notes/{NOTE_ID}&#34;
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID to use for this note.
     * 
     */
    @Import(name="noteId")
    private @Nullable Output<String> noteId;

    /**
     * @return The ID to use for this note.
     * 
     */
    public Optional<Output<String>> noteId() {
        return Optional.ofNullable(this.noteId);
    }

    /**
     * A note describing a package hosted by various package managers.
     * 
     */
    @Import(name="package")
    private @Nullable Output<PackageArgs> package_;

    /**
     * @return A note describing a package hosted by various package managers.
     * 
     */
    public Optional<Output<PackageArgs>> package_() {
        return Optional.ofNullable(this.package_);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * URLs associated with this note
     * 
     */
    @Import(name="relatedUrl")
    private @Nullable Output<List<RelatedUrlArgs>> relatedUrl;

    /**
     * @return URLs associated with this note
     * 
     */
    public Optional<Output<List<RelatedUrlArgs>>> relatedUrl() {
        return Optional.ofNullable(this.relatedUrl);
    }

    /**
     * A note describing a software bill of materials.
     * 
     */
    @Import(name="sbom")
    private @Nullable Output<DocumentNoteArgs> sbom;

    /**
     * @return A note describing a software bill of materials.
     * 
     */
    public Optional<Output<DocumentNoteArgs>> sbom() {
        return Optional.ofNullable(this.sbom);
    }

    /**
     * A one sentence description of this `Note`.
     * 
     */
    @Import(name="shortDescription")
    private @Nullable Output<String> shortDescription;

    /**
     * @return A one sentence description of this `Note`.
     * 
     */
    public Optional<Output<String>> shortDescription() {
        return Optional.ofNullable(this.shortDescription);
    }

    /**
     * A note describing an SPDX File.
     * 
     */
    @Import(name="spdxFile")
    private @Nullable Output<FileNoteArgs> spdxFile;

    /**
     * @return A note describing an SPDX File.
     * 
     */
    public Optional<Output<FileNoteArgs>> spdxFile() {
        return Optional.ofNullable(this.spdxFile);
    }

    /**
     * A note describing an SPDX Package.
     * 
     */
    @Import(name="spdxPackage")
    private @Nullable Output<PackageInfoNoteArgs> spdxPackage;

    /**
     * @return A note describing an SPDX Package.
     * 
     */
    public Optional<Output<PackageInfoNoteArgs>> spdxPackage() {
        return Optional.ofNullable(this.spdxPackage);
    }

    /**
     * A note describing a relationship between SPDX elements.
     * 
     */
    @Import(name="spdxRelationship")
    private @Nullable Output<RelationshipNoteArgs> spdxRelationship;

    /**
     * @return A note describing a relationship between SPDX elements.
     * 
     */
    public Optional<Output<RelationshipNoteArgs>> spdxRelationship() {
        return Optional.ofNullable(this.spdxRelationship);
    }

    /**
     * A note describing an upgrade.
     * 
     */
    @Import(name="upgrade")
    private @Nullable Output<UpgradeNoteArgs> upgrade;

    /**
     * @return A note describing an upgrade.
     * 
     */
    public Optional<Output<UpgradeNoteArgs>> upgrade() {
        return Optional.ofNullable(this.upgrade);
    }

    /**
     * A package vulnerability type of note.
     * 
     */
    @Import(name="vulnerabilityType")
    private @Nullable Output<VulnerabilityTypeArgs> vulnerabilityType;

    /**
     * @return A package vulnerability type of note.
     * 
     */
    public Optional<Output<VulnerabilityTypeArgs>> vulnerabilityType() {
        return Optional.ofNullable(this.vulnerabilityType);
    }

    private NoteArgs() {}

    private NoteArgs(NoteArgs $) {
        this.attestationAuthority = $.attestationAuthority;
        this.baseImage = $.baseImage;
        this.buildType = $.buildType;
        this.compliance = $.compliance;
        this.deployable = $.deployable;
        this.discovery = $.discovery;
        this.dsseAttestation = $.dsseAttestation;
        this.expirationTime = $.expirationTime;
        this.longDescription = $.longDescription;
        this.name = $.name;
        this.noteId = $.noteId;
        this.package_ = $.package_;
        this.project = $.project;
        this.relatedUrl = $.relatedUrl;
        this.sbom = $.sbom;
        this.shortDescription = $.shortDescription;
        this.spdxFile = $.spdxFile;
        this.spdxPackage = $.spdxPackage;
        this.spdxRelationship = $.spdxRelationship;
        this.upgrade = $.upgrade;
        this.vulnerabilityType = $.vulnerabilityType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NoteArgs $;

        public Builder() {
            $ = new NoteArgs();
        }

        public Builder(NoteArgs defaults) {
            $ = new NoteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attestationAuthority A note describing an attestation role.
         * 
         * @return builder
         * 
         */
        public Builder attestationAuthority(@Nullable Output<AttestationAuthorityArgs> attestationAuthority) {
            $.attestationAuthority = attestationAuthority;
            return this;
        }

        /**
         * @param attestationAuthority A note describing an attestation role.
         * 
         * @return builder
         * 
         */
        public Builder attestationAuthority(AttestationAuthorityArgs attestationAuthority) {
            return attestationAuthority(Output.of(attestationAuthority));
        }

        /**
         * @param baseImage A note describing a base image.
         * 
         * @return builder
         * 
         */
        public Builder baseImage(@Nullable Output<BasisArgs> baseImage) {
            $.baseImage = baseImage;
            return this;
        }

        /**
         * @param baseImage A note describing a base image.
         * 
         * @return builder
         * 
         */
        public Builder baseImage(BasisArgs baseImage) {
            return baseImage(Output.of(baseImage));
        }

        /**
         * @param buildType Build provenance type for a verifiable build.
         * 
         * @return builder
         * 
         */
        public Builder buildType(@Nullable Output<BuildTypeArgs> buildType) {
            $.buildType = buildType;
            return this;
        }

        /**
         * @param buildType Build provenance type for a verifiable build.
         * 
         * @return builder
         * 
         */
        public Builder buildType(BuildTypeArgs buildType) {
            return buildType(Output.of(buildType));
        }

        /**
         * @param compliance A note describing a compliance check.
         * 
         * @return builder
         * 
         */
        public Builder compliance(@Nullable Output<ComplianceNoteArgs> compliance) {
            $.compliance = compliance;
            return this;
        }

        /**
         * @param compliance A note describing a compliance check.
         * 
         * @return builder
         * 
         */
        public Builder compliance(ComplianceNoteArgs compliance) {
            return compliance(Output.of(compliance));
        }

        /**
         * @param deployable A note describing something that can be deployed.
         * 
         * @return builder
         * 
         */
        public Builder deployable(@Nullable Output<DeployableArgs> deployable) {
            $.deployable = deployable;
            return this;
        }

        /**
         * @param deployable A note describing something that can be deployed.
         * 
         * @return builder
         * 
         */
        public Builder deployable(DeployableArgs deployable) {
            return deployable(Output.of(deployable));
        }

        /**
         * @param discovery A note describing a provider/analysis type.
         * 
         * @return builder
         * 
         */
        public Builder discovery(@Nullable Output<DiscoveryArgs> discovery) {
            $.discovery = discovery;
            return this;
        }

        /**
         * @param discovery A note describing a provider/analysis type.
         * 
         * @return builder
         * 
         */
        public Builder discovery(DiscoveryArgs discovery) {
            return discovery(Output.of(discovery));
        }

        /**
         * @param dsseAttestation A note describing a dsse attestation note.
         * 
         * @return builder
         * 
         */
        public Builder dsseAttestation(@Nullable Output<DSSEAttestationNoteArgs> dsseAttestation) {
            $.dsseAttestation = dsseAttestation;
            return this;
        }

        /**
         * @param dsseAttestation A note describing a dsse attestation note.
         * 
         * @return builder
         * 
         */
        public Builder dsseAttestation(DSSEAttestationNoteArgs dsseAttestation) {
            return dsseAttestation(Output.of(dsseAttestation));
        }

        /**
         * @param expirationTime Time of expiration for this note, null if note does not expire.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime Time of expiration for this note, null if note does not expire.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param longDescription A detailed description of this `Note`.
         * 
         * @return builder
         * 
         */
        public Builder longDescription(@Nullable Output<String> longDescription) {
            $.longDescription = longDescription;
            return this;
        }

        /**
         * @param longDescription A detailed description of this `Note`.
         * 
         * @return builder
         * 
         */
        public Builder longDescription(String longDescription) {
            return longDescription(Output.of(longDescription));
        }

        /**
         * @param name The name of the note in the form &#34;projects/{provider_project_id}/notes/{NOTE_ID}&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the note in the form &#34;projects/{provider_project_id}/notes/{NOTE_ID}&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param noteId The ID to use for this note.
         * 
         * @return builder
         * 
         */
        public Builder noteId(@Nullable Output<String> noteId) {
            $.noteId = noteId;
            return this;
        }

        /**
         * @param noteId The ID to use for this note.
         * 
         * @return builder
         * 
         */
        public Builder noteId(String noteId) {
            return noteId(Output.of(noteId));
        }

        /**
         * @param package_ A note describing a package hosted by various package managers.
         * 
         * @return builder
         * 
         */
        public Builder package_(@Nullable Output<PackageArgs> package_) {
            $.package_ = package_;
            return this;
        }

        /**
         * @param package_ A note describing a package hosted by various package managers.
         * 
         * @return builder
         * 
         */
        public Builder package_(PackageArgs package_) {
            return package_(Output.of(package_));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param relatedUrl URLs associated with this note
         * 
         * @return builder
         * 
         */
        public Builder relatedUrl(@Nullable Output<List<RelatedUrlArgs>> relatedUrl) {
            $.relatedUrl = relatedUrl;
            return this;
        }

        /**
         * @param relatedUrl URLs associated with this note
         * 
         * @return builder
         * 
         */
        public Builder relatedUrl(List<RelatedUrlArgs> relatedUrl) {
            return relatedUrl(Output.of(relatedUrl));
        }

        /**
         * @param relatedUrl URLs associated with this note
         * 
         * @return builder
         * 
         */
        public Builder relatedUrl(RelatedUrlArgs... relatedUrl) {
            return relatedUrl(List.of(relatedUrl));
        }

        /**
         * @param sbom A note describing a software bill of materials.
         * 
         * @return builder
         * 
         */
        public Builder sbom(@Nullable Output<DocumentNoteArgs> sbom) {
            $.sbom = sbom;
            return this;
        }

        /**
         * @param sbom A note describing a software bill of materials.
         * 
         * @return builder
         * 
         */
        public Builder sbom(DocumentNoteArgs sbom) {
            return sbom(Output.of(sbom));
        }

        /**
         * @param shortDescription A one sentence description of this `Note`.
         * 
         * @return builder
         * 
         */
        public Builder shortDescription(@Nullable Output<String> shortDescription) {
            $.shortDescription = shortDescription;
            return this;
        }

        /**
         * @param shortDescription A one sentence description of this `Note`.
         * 
         * @return builder
         * 
         */
        public Builder shortDescription(String shortDescription) {
            return shortDescription(Output.of(shortDescription));
        }

        /**
         * @param spdxFile A note describing an SPDX File.
         * 
         * @return builder
         * 
         */
        public Builder spdxFile(@Nullable Output<FileNoteArgs> spdxFile) {
            $.spdxFile = spdxFile;
            return this;
        }

        /**
         * @param spdxFile A note describing an SPDX File.
         * 
         * @return builder
         * 
         */
        public Builder spdxFile(FileNoteArgs spdxFile) {
            return spdxFile(Output.of(spdxFile));
        }

        /**
         * @param spdxPackage A note describing an SPDX Package.
         * 
         * @return builder
         * 
         */
        public Builder spdxPackage(@Nullable Output<PackageInfoNoteArgs> spdxPackage) {
            $.spdxPackage = spdxPackage;
            return this;
        }

        /**
         * @param spdxPackage A note describing an SPDX Package.
         * 
         * @return builder
         * 
         */
        public Builder spdxPackage(PackageInfoNoteArgs spdxPackage) {
            return spdxPackage(Output.of(spdxPackage));
        }

        /**
         * @param spdxRelationship A note describing a relationship between SPDX elements.
         * 
         * @return builder
         * 
         */
        public Builder spdxRelationship(@Nullable Output<RelationshipNoteArgs> spdxRelationship) {
            $.spdxRelationship = spdxRelationship;
            return this;
        }

        /**
         * @param spdxRelationship A note describing a relationship between SPDX elements.
         * 
         * @return builder
         * 
         */
        public Builder spdxRelationship(RelationshipNoteArgs spdxRelationship) {
            return spdxRelationship(Output.of(spdxRelationship));
        }

        /**
         * @param upgrade A note describing an upgrade.
         * 
         * @return builder
         * 
         */
        public Builder upgrade(@Nullable Output<UpgradeNoteArgs> upgrade) {
            $.upgrade = upgrade;
            return this;
        }

        /**
         * @param upgrade A note describing an upgrade.
         * 
         * @return builder
         * 
         */
        public Builder upgrade(UpgradeNoteArgs upgrade) {
            return upgrade(Output.of(upgrade));
        }

        /**
         * @param vulnerabilityType A package vulnerability type of note.
         * 
         * @return builder
         * 
         */
        public Builder vulnerabilityType(@Nullable Output<VulnerabilityTypeArgs> vulnerabilityType) {
            $.vulnerabilityType = vulnerabilityType;
            return this;
        }

        /**
         * @param vulnerabilityType A package vulnerability type of note.
         * 
         * @return builder
         * 
         */
        public Builder vulnerabilityType(VulnerabilityTypeArgs vulnerabilityType) {
            return vulnerabilityType(Output.of(vulnerabilityType));
        }

        public NoteArgs build() {
            return $;
        }
    }

}