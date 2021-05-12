
solution {
    puzzle = "P056"
    name = "NO-TRACK I-"
    arm(PISTON) {
        number = 1
        position = -2 to 0
        rotation = -2
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = 0 to -3
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = 3 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -3 to 0
        rotation = 0
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 3 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
