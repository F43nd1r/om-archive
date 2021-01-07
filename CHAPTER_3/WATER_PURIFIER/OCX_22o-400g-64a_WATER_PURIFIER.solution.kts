
solution {
    puzzle = "P025"
    name = "OVERLAP X"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to 2
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 1
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to 1
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 2 to -2
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = 2 to -2
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -5 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    track {
        position = 4 to -6
        positions = listOf(-3 to 4, -4 to 4, -5 to 4, -6 to 4, -7 to 4, -8 to 4, -9 to 4)
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 3 to -1
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = -2 to 3
        positions = listOf(2 to -1, 1 to -1, 2 to -2, 3 to -2, 3 to -3, 4 to -3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                back()
                wait(1)
                back()
                wait(1)
                back()
                wait(1)
                back()
                wait(1)
                back()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                back()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
                wait(4)
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(12)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateCounterClockwise()
                wait(3)
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
