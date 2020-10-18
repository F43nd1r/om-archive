
solution {
    puzzle = "P038"
    name = "OVERLAP A"
    arm(PISTON) {
        number = 1
        position = 7 to -4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 5 to -3
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 1 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 7 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 0 to 1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = 3
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to -4
        rotation = 2
    }
    glyph(BONDER) {
        position = 6 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 4 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 5 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = 5 to -2
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 5 to -2
        rotation = 0
    }
    track {
        position = 7 to -4
        positions = listOf(-1 to 2, 0 to 1, 0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0)
    }
    track {
        position = 5 to -3
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = 0 to 0
        positions = listOf(1 to 0, 1 to -1)
    }
    track {
        position = 0 to 1
        positions = listOf(1 to -1, 0 to 0, 1 to 0)
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 1 to -1, 2 to -2)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(9)
                grab()
                rotateCounterClockwise()
                wait(1)
                forward()
                drop()
                wait(2)
                grab()
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
                back()
                rotateClockwise()
                forward()
                grab()
                retract()
                retract()
                drop()
                back()
                grab()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(4) {
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
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                wait(2)
                retract()
                back()
                rotateCounterClockwise()
                wait(3)
                extend()
                extend()
                wait(1)
                back()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                back()
                wait(6)
                grab()
                forward()
                drop()
            }
        }
        )
    }
}
