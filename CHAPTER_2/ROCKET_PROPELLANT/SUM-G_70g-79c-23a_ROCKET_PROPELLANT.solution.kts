
solution {
    puzzle = "P019"
    name = "B X S"
    arm(ARM6) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
