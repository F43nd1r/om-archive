
solution {
    puzzle = "P082"
    name = "B X II"
    arm(PISTON) {
        number = 1
        position = 1 to 4
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to 1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 4 to 0
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = -1 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 4 to 2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 3 to 4
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 2
        rotation = -2
    }
    track {
        position = 2 to 0
        positions = listOf(2 to 0, 1 to 0)
    }
    conduit {
        id = 100
        position = 1 to 2
        rotation = -1
    }
    conduit {
        id = 100
        position = 0 to 0
        rotation = -2
    }
    conduit {
        id = 101
        position = 6 to 1
        rotation = 0
    }
    conduit {
        id = 101
        position = 8 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                retract()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                extend()
                extend()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                grab()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
