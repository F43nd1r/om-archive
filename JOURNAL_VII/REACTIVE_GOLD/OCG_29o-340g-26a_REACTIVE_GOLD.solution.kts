
solution {
    puzzle = "P095"
    name = "OVERLAP"
    arm(ARM1) {
        number = 1
        position = -1 to -2
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to -4
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -3
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -3
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -2 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -3
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -3
        rotation = -4
    }
    glyph(PROJECTION) {
        position = -2 to -1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 4
    }
    glyph(PURIFICATION) {
        position = -2 to -3
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -3
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = -3
    }
    track {
        position = 2 to -4
        positions = listOf(-2 to 0, -3 to 0)
    }
    track {
        position = -1 to -1
        positions = listOf(-1 to 0, -1 to 1, 0 to 1, 1 to 0, 0 to 0, 0 to -1)
    }
    track {
        position = 4 to -4
        positions = listOf(-3 to 1, -2 to 1, -1 to 1, -1 to 2)
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                wait(1)
                forward()
                pivotClockwise()
                forward()
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
                wait(4)
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(10)
                grab()
                rotateClockwise()
                back()
                wait(3)
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
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
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                back()
                back()
                wait(1)
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
                wait(1)
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
