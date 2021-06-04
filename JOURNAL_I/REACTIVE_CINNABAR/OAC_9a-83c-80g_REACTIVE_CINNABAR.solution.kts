
solution {
    puzzle = "P056"
    name = "OAX?"
    arm(ARM1) {
        number = 1
        position = -4 to 0
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -5 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -4 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to -1
        rotation = 0
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
