
solution {
    puzzle = "P038"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -1
        rotation = -7
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 6 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to -4
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = 3 to 4
        rotation = -2
    }
    glyph(BONDER) {
        position = 5 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 3 to -5
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 2 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = -7
    }
    io(INPUT) {
        index = 1
        position = 2 to -4
        rotation = 0
    }
    track {
        position = 0 to -4
        positions = listOf(1 to 0, 1 to -1, 2 to -1)
    }
    track {
        position = 4 to -2
        positions = listOf(0 to -1, 1 to -1, 2 to -1, 2 to -2)
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -3 to 2
        positions = listOf(4 to 2, 3 to 2, 2 to 2, 2 to 1, 2 to 0, 2 to -1, 2 to -2, 2 to -3, 3 to -4)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(3)
                grab()
                forward()
                wait(3)
                rotateClockwise()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                pivotCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                drop()
                back()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                forward()
                wait(1)
                forward()
                drop()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(17)
                back()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                wait(7)
                rotateClockwise()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
