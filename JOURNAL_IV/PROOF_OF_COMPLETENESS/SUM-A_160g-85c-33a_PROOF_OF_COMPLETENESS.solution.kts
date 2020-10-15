
solution {
    puzzle = "P069"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to -4
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 3 to -4
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -3
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to -5
        rotation = 1
    }
    io(OUTPUT) {
        index = 2
        position = 5 to -5
        rotation = 2
    }
    io(OUTPUT) {
        index = 3
        position = 4 to -1
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
