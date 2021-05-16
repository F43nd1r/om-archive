
solution {
    puzzle = "P034"
    name = "SUM4 TIE (Copy)"
    arm(ARM1) {
        number = 1
        position = -5 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 3
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 4 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to 3
        rotation = 4
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 3 to 0
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -4 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
