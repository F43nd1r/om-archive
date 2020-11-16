
solution {
    puzzle = "P034"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -11 to 4
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 5 to -3
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 3 to -5
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to 1
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 1 to -7
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = 0 to -7
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 1 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 0 to 2
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 5
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 6
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = 3 to -4
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -6 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -10 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to -5
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 0 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 2 to -5
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -4
        rotation = 0
    }
    track {
        position = 5 to -2
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 3 to -1, 2 to -1, 1 to -1, 0 to -1)
    }
    track {
        position = -1 to -7
        positions = listOf(1 to -1, 1 to 0, 1 to 1, 1 to 2, 2 to 1, 2 to 0, 2 to -1, 2 to -2)
    }
    track {
        position = -11 to 4
        positions = listOf(0 to 0, 0 to 1, 1 to 0, 2 to -1, 3 to -2)
    }
    track {
        position = -1 to 3
        positions = listOf(0 to 0, 1 to -1, 1 to -2)
    }
    track {
        position = 2 to -4
        positions = listOf(0 to 5, 1 to 5, 1 to 4, 0 to 4)
    }
    track {
        position = -7 to 0
        positions = listOf(7 to -1, 6 to -1, 5 to -1, 4 to -1, 3 to -1, 2 to -1, 1 to -1, 0 to -1, -1 to -1, -2 to -1, -3 to -1, -4 to -1)
    }
    track {
        position = 1 to -4
        positions = listOf(0 to 0, -1 to 0, 0 to -1, 1 to -2, 1 to -1, 2 to -2, 2 to -1)
    }
    track {
        position = 1 to -3
        positions = listOf(0 to 0, -1 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(13)
                grab()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                retract()
                wait(1)
                retract()
                wait(1)
                back()
                wait(1)
                extend()
                extend()
                forward()
                forward()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                forward()
                retract()
                retract()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                extend()
                extend()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                pivotClockwise()
                back()
                forward()
                pivotClockwise()
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
                wait(3)
                rotateCounterClockwise()
                extend()
                extend()
                forward()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                forward()
                forward()
                wait(11)
                forward()
                grab()
                back()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                retract()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                forward()
                forward()
                forward()
                forward()
                extend()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(15)
                grab()
                back()
                rotateCounterClockwise()
                wait(1)
                forward()
                forward()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                wait(2)
                back()
                pivotClockwise()
            }
        }
        )
    }
}
