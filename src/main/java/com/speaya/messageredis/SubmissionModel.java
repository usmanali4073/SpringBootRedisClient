package com.speaya.messageredis;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("submission")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionModel {
    @Id
    String Id;
    String value;
}
