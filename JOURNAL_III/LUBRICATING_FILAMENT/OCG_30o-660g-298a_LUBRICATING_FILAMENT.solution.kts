
solution {
    puzzle = "P065"
    name = "OVERLAP A"
    arm(PISTON) {
        number = 1
        position = -4 to 3
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -3 to 4
        rotation = 4
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -2 to 3
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -1 to 2
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 1 to 2
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -7 to 3
        rotation = 17
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = -7 to 4
        rotation = 17
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 6 to -4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 5 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 5 to -4
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 11
        position = 6 to -6
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 4 to 0
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -5 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 1
        rotation = 0
    }
    track {
        position = 6 to -4
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    track {
        position = -7 to 4
        positions = listOf(1 to -1, 0 to 0, 0 to -1)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 3 to -2, 4 to -2, 4 to -3, 3 to -3, 2 to -2, 1 to -1)
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, -1 to 0, -2 to 1)
    }
    track {
        position = 0 to -6
        positions = listOf(0 to 2, 0 to 1, 1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0, 6 to 0)
    }
    tape {
        parallel(
        {
            sequence(8) {
                wait(7)
                grab()
                rotateClockwise()
                wait(1)
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                grab()
                forward()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                back()
                pivotClockwise()
                extend()
                drop()
                retract()
                back()
                back()
                wait(2)
                grab()
                back()
                pivotClockwise()
                extend()
                drop()
                retract()
                back()
                back()
                wait(2)
                grab()
                back()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                forward()
                pivotClockwise()
                extend()
                drop()
                retract()
                back()
                back()
                wait(2)
                grab()
                back()
                pivotClockwise()
                extend()
                drop()
                retract()
                back()
                back()
                wait(2)
                grab()
                back()
                pivotClockwise()
                extend()
                drop()
                retract()
                back()
                back()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                pivotClockwise()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                forward()
                forward()
                retract()
                rotateClockwise()
                wait(2)
                forward()
                wait(2)
                grab()
                forward()
                extend()
                pivotClockwise()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                forward()
                grab()
                forward()
                extend()
                pivotClockwise()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                forward()
                forward()
                wait(4)
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                forward()
                wait(1)
                forward()
                wait(3)
                grab()
                forward()
                extend()
                pivotClockwise()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                forward()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                wait(3)
                grab()
                forward()
                extend()
                pivotClockwise()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                wait(25)
                grab()
                back()
                extend()
                extend()
                back()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(11)
                grab()
                retract()
                pivotClockwise()
                retract()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                wait(4)
                back()
                extend()
                extend()
                back()
            }
        }
        , 
        {
            sequence(9) {
                wait(10)
                forward()
                drop()
                grab()
                forward()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                grab()
                forward()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                rotateClockwise()
                forward()
            }
        }
        )
    }
}
