
solution {
    puzzle = "P026"
    name = "OCX"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -4
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 1 to -2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to -3
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -3
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 2 to -4
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                wait(21)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                back()
                pivotClockwise()
                forward()
                pivotClockwise()
                back()
                pivotClockwise()
                forward()
                pivotClockwise()
                back()
                pivotClockwise()
                forward()
                pivotClockwise()
                back()
                pivotClockwise()
                forward()
                pivotClockwise()
                back()
                pivotClockwise()
                forward()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
