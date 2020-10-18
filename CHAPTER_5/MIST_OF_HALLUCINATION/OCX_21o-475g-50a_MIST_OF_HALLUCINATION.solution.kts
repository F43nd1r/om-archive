
solution {
    puzzle = "P038"
    name = "OVERLAP X"
    arm(PISTON) {
        number = 1
        position = 4 to -4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 2 to -3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 4 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -5 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to 1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 3
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 1 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 2 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    track {
        position = -3 to 0
        positions = listOf(1 to -1, 1 to 0, 2 to 0, 2 to 1, 1 to 1, 0 to 1, 0 to 0)
    }
    track {
        position = -5 to -1
        positions = listOf(0 to 0, 1 to -1, 2 to -2)
    }
    track {
        position = 4 to -4
        positions = listOf(-1 to 2, 0 to 1, 0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0)
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
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
            sequence(6) {
                wait(8)
                back()
                wait(1)
                back()
                wait(5)
                grab()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                wait(3)
                forward()
                forward()
                wait(1)
                rotateCounterClockwise()
                wait(2)
                forward()
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
        )
    }
}
