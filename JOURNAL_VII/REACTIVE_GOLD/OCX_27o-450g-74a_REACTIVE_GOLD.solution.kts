
solution {
    puzzle = "P095"
    name = "OVERLAP (Copy) (Copy)"
    arm(ARM1) {
        number = 1
        position = -5 to 1
        rotation = -7
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -3 to -2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to -5
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 3 to -4
        rotation = 3
        size = 3
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
        position = -3 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -3
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -1 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 1
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
    glyph(PROJECTION) {
        position = 1 to -4
        rotation = -3
    }
    glyph(PROJECTION) {
        position = 0 to -2
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -2 to -3
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
        position = 1 to -3
        positions = listOf(0 to -2, 0 to -3, -1 to -3)
    }
    track {
        position = -5 to 2
        positions = listOf(0 to -1, 0 to 0)
    }
    track {
        position = -3 to -2
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = 3 to -3
        positions = listOf(-3 to 1, -2 to 1, -2 to 2, -3 to 2)
    }
    track {
        position = 3 to -4
        positions = listOf(0 to 0, -1 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                forward()
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
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                retract()
                wait(2)
                retract()
                extend()
                wait(2)
                retract()
                extend()
                wait(2)
                retract()
                extend()
                wait(2)
                retract()
                extend()
                forward()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
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
                wait(1)
                forward()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(17)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(1)
                forward()
                drop()
            }
        }
        )
    }
}
