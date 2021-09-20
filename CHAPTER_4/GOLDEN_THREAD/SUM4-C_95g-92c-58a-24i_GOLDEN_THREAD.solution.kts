
solution {
    puzzle = "P037"
    name = "B F"
    arm(ARM6) {
        number = 1
        position = -5 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to -1
        rotation = 0
    }
    track {
        position = -4 to -2
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
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
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
