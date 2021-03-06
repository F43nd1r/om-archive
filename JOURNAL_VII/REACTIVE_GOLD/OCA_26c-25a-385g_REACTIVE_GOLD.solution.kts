
solution {
    puzzle = "P095"
    name = "OVERLAP AX"
    arm(PISTON) {
        number = 1
        position = -2 to 0
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to -3
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 3 to -4
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -4
        rotation = 1
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
        position = -3 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -3
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 4
    }
    glyph(PROJECTION) {
        position = 0 to -3
        rotation = -4
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
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
        positions = listOf(-1 to 1, 0 to 1, 0 to 2)
    }
    track {
        position = 3 to -5
        positions = listOf(0 to 1, -1 to 1, -2 to 1)
    }
    track {
        position = -1 to -1
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = -2 to 0
        positions = listOf(0 to -3, -1 to -3)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                wait(1)
                back()
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                back()
                forward()
                wait(2)
                back()
                forward()
                wait(1)
                back()
                forward()
                wait(1)
                rotateClockwise()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                wait(7)
                grab()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(16)
                grab()
                forward()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(2)
                back()
                forward()
                wait(2)
                back()
                forward()
                wait(1)
                back()
                forward()
                wait(2)
                back()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                forward()
                back()
                pivotClockwise()
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
                rotateCounterClockwise()
                drop()
                wait(9)
                extendTape()
            }
        }
        )
    }
}
