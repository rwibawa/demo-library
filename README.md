# demoLibrary
How to Create a Java Library: From Scratch to Maven Central

* [tutorial](https://dzone.com/articles/how-to-create-a-java-library-from-scratch-to-maven)
* [GPG Client for Windows](https://gpg4win.org/thanks-for-download.html)
* [PGP signatures](https://central.sonatype.org/pages/working-with-pgp-signatures.html)

## Register to Publish Via the Central Portal
[publish](https://central.sonatype.org/register/central-portal/)

### Create an Account
If you haven't signed up for the Central Portal or have been automatically signed out, 
click the "Sign In" link at the top right of [https://central.sonatype.com](https://central.sonatype.com).

### Create a Namespace
Once you have registered your account, follow the instructions in our [namespace registration page](https://central.sonatype.org/register/namespace/) to create one.

### Create a PGP signature
```shell
C:\>gpg --gen-key
Real name: Ryan Wibawa
Email address: ryan.wibawa@gmail.com
You selected this USER-ID:
    "Ryan Wibawa <ryan.wibawa@gmail.com>"

passphrase: <secret>

C:\>gpg --list-keys
gpg: checking the trustdb
gpg: marginals needed: 3  completes needed: 1  trust model: pgp
gpg: depth: 0  valid:   1  signed:   0  trust: 0-, 0q, 0n, 0m, 0f, 1u
gpg: next trustdb check due at 2027-01-09
/c/Users/Ryan/.gnupg/pubring.kbx
--------------------------------
pub   rsa3072 2025-01-09 [SC] [expires: 2027-01-09]
      7133E038618408BFA9D598F2995A228EEC49BA25
uid           [ultimate] Ryan Wibawa <ryan.wibawa@gmail.com>
sub   rsa3072 2025-01-09 [E] [expires: 2027-01-09]
```

## Client Demo
### `pom.xml`
```xml
<dependencies>
    <dependency>
      <groupId>io.github.rwibawa.api.demoLibrary</groupId>
      <artifactId>demoLibrary</artifactId>
      <version>0.0.1</version>
    </dependency>
</dependencies>
```

### `App.java`
```java
import io.github.rwibawa.api.demoLibrary.StringPadder;
import io.github.rwibawa.api.demoLibrary.StringPadderFactory;

public class App 
{
    public static void main( String[] args )
    {
        StringPadder stringPadder = StringPadderFactory.createStringPadder();
        System.out.println(stringPadder.padLeft("thegreatapi.com", 20));
    }
}
```