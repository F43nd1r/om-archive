
solution {
    puzzle = "P007"
    name = "B GAGX"
    arm(ARM1) {
        number = 1
        position = 2 to -1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
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
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
