
solution {
    puzzle = "P083"
    name = "B IG 1-6T"
    arm(ARM1) {
        number = 1
        position = 1 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 8 to -2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 10 to -1
        rotation = 2
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 9 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 0
        rotation = 3
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 8 to -2
        positions = listOf(0 to 0, -1 to 1)
    }
    conduit {
        id = 100
        position = 2 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 9 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                drop()
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                extend()
                pivotClockwise()
                drop()
                retract()
                retract()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                grab()
                extend()
                forward()
                drop()
                retract()
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                wait(1)
                back()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(16)
                retract()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                grab()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
