
solution {
    puzzle = "P095"
    name = "OVERLAP GX"
    arm(ARM1) {
        number = 1
        position = -2 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 1 to 0
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -4 to 2
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = -4
    }
    glyph(PROJECTION) {
        position = -4 to 2
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -3 to 2
        rotation = 4
    }
    glyph(PURIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -4 to 2
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -4 to 1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = -3
    }
    track {
        position = 0 to -1
        positions = listOf(-2 to 0, -3 to 0)
    }
    track {
        position = 2 to -1
        positions = listOf(-1 to 1, -1 to 2)
    }
    track {
        position = -3 to 3
        positions = listOf(1 to -1, 0 to -1, -1 to -1, -1 to 0, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                rotateCounterClockwise()
                forward()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(5)
                grab()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(2)
                back()
                back()
                forward()
                forward()
                wait(2)
                rotateCounterClockwise()
                rotateClockwise()
                back()
                back()
                forward()
                forward()
                wait(2)
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                retract()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                wait(1)
                forward()
                pivotClockwise()
                wait(1)
                back()
                forward()
                pivotClockwise()
                back()
                forward()
                wait(3)
                back()
                forward()
                wait(1)
                extend()
                wait(4)
                extend()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                forward()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
