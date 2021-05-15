
solution {
    puzzle = "P065"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = -5 to 3
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -5 to 4
        rotation = 4
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -4 to 3
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -3 to 2
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -4 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -7 to -1
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -8 to 3
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 4 to -4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 3 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 4 to 0
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 11
        position = 5 to -6
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 0 to -6
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -7 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to 1
        rotation = -1
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
        position = -5 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to -4
        rotation = 7
    }
    glyph(BONDER) {
        position = 5 to -5
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -7 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to -4
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -5 to 2
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -7 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -7 to 1
        rotation = 0
    }
    track {
        position = 4 to -4
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    track {
        position = -5 to 4
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 3 to -2, 4 to -2, 4 to -3, 3 to -3, 2 to -2, 1 to -1)
    }
    track {
        position = -3 to -4
        positions = listOf(0 to 1, 0 to 0, 1 to -1, 2 to -2, 3 to -3, 3 to -2)
    }
    track {
        position = 5 to -3
        positions = listOf(0 to 0, 0 to 1, 0 to 2, -1 to 3)
    }
    track {
        position = -6 to -2
        positions = listOf(1 to -1, 0 to 0, -1 to 1, -1 to 2, 0 to 2)
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -2 to 0
        positions = listOf(-1 to 1, 0 to 0, -1 to 0, -2 to 1)
    }
    track {
        position = -4 to 1
        positions = listOf(0 to 0, -1 to 1, -1 to 2)
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
                wait(3)
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
                wait(1)
                grab()
                forward()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(11) {
                wait(11)
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(18)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                wait(4)
                back()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                extend()
                pivotClockwise()
                extend()
                reset()
                wait(5)
                repeat()
                wait(9)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                forward()
                retract()
                rotateCounterClockwise()
                forward()
                forward()
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
            sequence(6) {
                wait(10)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                forward()
                forward()
                wait(3)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                forward()
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
            }
        }
        , 
        {
            sequence(1) {
                wait(24)
                grab()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
            }
        }
        )
    }
}
