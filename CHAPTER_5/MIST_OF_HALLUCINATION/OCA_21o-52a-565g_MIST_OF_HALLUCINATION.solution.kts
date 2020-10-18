
solution {
    puzzle = "P038"
    name = "OCA 52"
    arm(PISTON) {
        number = 1
        position = 4 to -4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to -3
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -2 to 1
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 1 to -5
        rotation = 1
        size = 2
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
        position = 2 to -4
        rotation = 2
    }
    glyph(BONDER) {
        position = -4 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = -1
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
        position = 2 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 1 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -3 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to -3
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -4 to -4
        rotation = -1
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
        position = -5 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 4 to -4
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0)
    }
    track {
        position = 1 to -5
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 3 to -3
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    track {
        position = -3 to 0
        positions = listOf(1 to -1, 1 to 0, 2 to 0, 2 to 1, 1 to 1, 0 to 1, -1 to 1, 0 to 0)
    }
    tape {
        parallel(
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
                drop()
                retract()
                back()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                forward()
                wait(3)
                rotateClockwise()
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
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                rotateCounterClockwise()
                wait(1)
                forward()
                drop()
                back()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                retract()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(3)
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
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                retract()
                wait(1)
                forward()
                rotateCounterClockwise()
                wait(3)
                forward()
                extend()
                wait(1)
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                back()
                back()
                wait(5)
                grab()
                back()
                drop()
                forward()
                reset()
            }
        }
        )
    }
}
