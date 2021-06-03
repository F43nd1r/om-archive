
solution {
    puzzle = "w1698785633"
    name = "OVERLAP CC"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to 0
        rotation = 2
    }
    glyph(PROJECTION) {
        position = 2 to 1
        rotation = 3
    }
    glyph(PROJECTION) {
        position = 2 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    track {
        position = -4 to 2
        positions = listOf(-2 to 0, -1 to 0, 0 to 0, 1 to 0, 2 to 0, 3 to 0, 3 to -1, 2 to -1, 1 to -1)
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                forward()
                forward()
                wait(3)
                back()
                back()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                forward()
                wait(6)
                back()
                drop()
            }
        }
        )
    }
}
