package pl.szady.testmanager.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TestCase")
public class TestCase {

    @Id
    @Column(name = "UID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Column(name = "Step")
    private Integer step;

    @Column(name = "Summary")
    private String summary;

    @Column(name = "ExpectedResult")
    private String expectedResult;

    @Column(name = "ExecutionType")
    private String executionType;

    @ManyToOne
    @JoinColumn(name = "testsuite_id")
    private TestSuite testSuite;

}
