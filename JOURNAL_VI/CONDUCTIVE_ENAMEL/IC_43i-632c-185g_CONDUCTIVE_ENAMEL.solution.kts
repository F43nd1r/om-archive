
solution {
    puzzle = "P093"
    name = "B X II 1-5"
    arm(ARM6) {
        number = 1
        position = -1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 7 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 11 to -2
        rotation = 2
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 8 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 8 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 10 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, -1 to 1, -2 to 2, -2 to 1, -1 to 0)
    }
    conduit {
        id = 100
        position = 0 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 7 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(7)
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
