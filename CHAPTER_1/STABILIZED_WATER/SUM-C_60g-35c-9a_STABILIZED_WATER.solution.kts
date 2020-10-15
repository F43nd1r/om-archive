
solution {
    puzzle = "P007"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = 4 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
