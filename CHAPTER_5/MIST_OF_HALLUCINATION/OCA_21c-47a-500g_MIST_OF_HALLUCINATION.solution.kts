
solution {
    puzzle = "P038"
    name = "OVERLAP A"
    arm(PISTON) {
        number = 1
        position = 5 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 5 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -2 to 4
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -4 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -4 to 0
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 4 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 3 to 1
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 3 to 1
        rotation = 0
    }
    track {
        position = -2 to 3
        positions = listOf(1 to -1, 1 to 0, 1 to 1, 0 to 1, 0 to 0)
    }
    track {
        position = -2 to -1
        positions = listOf(-2 to 3, -1 to 2, 0 to 1, 0 to 0, -1 to 0, -2 to 1)
    }
    track {
        position = 5 to -1
        positions = listOf(-1 to 2, 0 to 1, 0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0)
    }
    track {
        position = 3 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                forward()
                wait(1)
                forward()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                extend()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                retract()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                forward()
                forward()
                wait(4)
                grab()
                rotateCounterClockwise()
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
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                forward()
                wait(5)
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
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
                back()
                forward()
                wait(3)
                grab()
                forward()
                wait(1)
                rotateCounterClockwise()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                back()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
            }
        }
        )
    }
}
