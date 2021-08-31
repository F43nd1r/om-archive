
solution {
    puzzle = "P103"
    name = "SUM + 64"
    arm(ARM1) {
        number = 1
        position = -2 to 6
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 5 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 7 to -2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 6 to -1
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = -5 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 7 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 7 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 2 to -3
        rotation = -3
    }
    track {
        position = -2 to 7
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 6 to -2
        positions = listOf(1 to 0, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
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
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
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
                wait(5)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(119)
                forward()
                grab()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                reset()
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
