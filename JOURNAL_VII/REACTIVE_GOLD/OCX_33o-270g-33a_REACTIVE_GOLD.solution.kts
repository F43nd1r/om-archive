
solution {
    puzzle = "P095"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -4 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 3
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -1 to 1
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = -3 to 1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = -2
    }
    track {
        position = 1 to 1
        positions = listOf(0 to -3, 1 to -4, 1 to -5)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 1)
    }
    track {
        position = 0 to 5
        positions = listOf(-1 to -2, -1 to -1, -1 to 0, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                forward()
                forward()
                wait(2)
                back()
                forward()
                wait(2)
                back()
                forward()
                wait(2)
                back()
                forward()
                wait(2)
                back()
                forward()
                wait(2)
                back()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                back()
                forward()
                wait(1)
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
                back()
                forward()
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                forward()
                wait(1)
                forward()
                wait(2)
                back()
                forward()
                wait(2)
                back()
                forward()
                wait(2)
                back()
                forward()
                wait(2)
                back()
                forward()
                wait(2)
                back()
                forward()
                wait(2)
                back()
                forward()
            }
        }
        )
    }
}
