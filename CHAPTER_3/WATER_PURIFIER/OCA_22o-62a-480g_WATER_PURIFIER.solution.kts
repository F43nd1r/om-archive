
solution {
    puzzle = "P025"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to 1
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -3 to 1
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -3 to 2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to 0
        rotation = -1
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
        position = -1 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = -1
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
        position = -2 to 3
        positions = listOf(2 to -2, 3 to -2)
    }
    track {
        position = -2 to 1
        positions = listOf(-3 to -3, -2 to -3, -1 to -3, 0 to -3, 1 to -3, 2 to -3, 3 to -3, 2 to -2, 1 to -2, 0 to -2, 0 to -1, 0 to 0, -1 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                reset()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                pivotClockwise()
                extend()
                back()
                back()
                back()
                extend()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                back()
                grab()
                rotateCounterClockwise()
                forward()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                back()
                extend()
                back()
                drop()
                wait(2)
                back()
                wait(1)
                back()
                back()
                wait(1)
                reset()
            }
        }
        )
    }
}
