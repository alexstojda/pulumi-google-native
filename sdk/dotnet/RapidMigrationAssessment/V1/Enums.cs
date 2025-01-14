// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.ComponentModel;
using Pulumi;

namespace Pulumi.GoogleNative.RapidMigrationAssessment.V1
{
    /// <summary>
    /// Type of an annotation.
    /// </summary>
    [EnumType]
    public readonly struct AnnotationType : IEquatable<AnnotationType>
    {
        private readonly string _value;

        private AnnotationType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Unknown type
        /// </summary>
        public static AnnotationType TypeUnspecified { get; } = new AnnotationType("TYPE_UNSPECIFIED");
        /// <summary>
        /// Indicates that this project has opted into StratoZone export.
        /// </summary>
        public static AnnotationType TypeLegacyExportConsent { get; } = new AnnotationType("TYPE_LEGACY_EXPORT_CONSENT");
        /// <summary>
        /// Indicates that this project is created by Qwiklab.
        /// </summary>
        public static AnnotationType TypeQwiklab { get; } = new AnnotationType("TYPE_QWIKLAB");

        public static bool operator ==(AnnotationType left, AnnotationType right) => left.Equals(right);
        public static bool operator !=(AnnotationType left, AnnotationType right) => !left.Equals(right);

        public static explicit operator string(AnnotationType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is AnnotationType other && Equals(other);
        public bool Equals(AnnotationType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }
}
