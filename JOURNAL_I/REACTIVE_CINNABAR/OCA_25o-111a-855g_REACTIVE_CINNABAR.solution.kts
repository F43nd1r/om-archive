
solution {
    puzzle = "P056"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -1 to 0
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -5 to 2
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -2 to -2
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -2 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 1 to -4
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 0 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 7 to -7
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = 9 to -9
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -3
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -10
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -6
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to -6
        rotation = -2
    }
    glyph(BONDER) {
        position = 2 to -8
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = -3
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -8
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = -7
    }
    glyph(BONDER) {
        position = -3 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = -4
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = -5
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to -2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -10
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -4 to -1
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    track {
        position = 9 to -2
        positions = listOf(-2 to -5, -3 to -4)
    }
    track {
        position = 6 to 0
        positions = listOf(0 to 0, 0 to -1, 0 to -2, -1 to -2, -2 to -2, -2 to -3, -3 to -2)
    }
    track {
        position = 7 to 1
        positions = listOf(-1 to -2, -2 to -2, -3 to -2, -4 to -2, -5 to -2, -6 to -2, -7 to -2, -8 to -1, -9 to 0, -8 to 0, -7 to 0)
    }
    track {
        position = 1 to -9
        positions = listOf(0 to -1, 0 to 0, 0 to 1, -1 to 2)
    }
    track {
        position = 1 to -7
        positions = listOf(0 to -1, 0 to 0, 0 to 1, 0 to 2, -1 to 2, -2 to 2)
    }
    track {
        position = -5 to -2
        positions = listOf(6 to -3, 6 to -2, 5 to -2, 4 to -2, 3 to -2)
    }
    track {
        position = -5 to -2
        positions = listOf(0 to 2, 0 to 3, 0 to 4)
    }
    track {
        position = -4 to -3
        positions = listOf(0 to -1, 0 to 0, 0 to 1, 1 to 1, 2 to 1)
    }
    track {
        position = 9 to -9
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -3 to 2, -4 to 3, -5 to 4)
    }
    tape {
        parallel(
        {
            sequence(8) {
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateClockwise()
                forward()
                wait(7)
                forward()
                drop()
                forward()
                wait(7)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                forward()
                rotateClockwise()
                wait(7)
                grab()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
            }
        }
        , 
        {
            sequence(11) {
                wait(14)
                grab()
                pivotCounterClockwise()
                wait(2)
                forward()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(13)
                back()
                grab()
                forward()
                rotateCounterClockwise()
                retract()
                forward()
                rotateClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                back()
                back()
                wait(2)
                back()
                forward()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(17)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotClockwise()
                retract()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                back()
                back()
                back()
                back()
                back()
                wait(1)
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                forward()
                forward()
                rotateClockwise()
                wait(5)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                retract()
                pivotCounterClockwise()
                back()
                back()
                rotateCounterClockwise()
                retract()
                back()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                extend()
                extend()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                back()
                grab()
                forward()
                back()
                wait(1)
                rotateCounterClockwise()
                back()
                drop()
            }
        }
        )
    }
}
