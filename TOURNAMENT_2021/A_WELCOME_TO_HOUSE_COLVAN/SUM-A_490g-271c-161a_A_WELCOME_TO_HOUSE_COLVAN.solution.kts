
solution {
    puzzle = "w2450560971"
    name = "H3 6T"
    arm(PISTON) {
        number = 1
        position = -10 to 1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -9 to 2
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -12 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -13 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -14 to 0
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -3 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -2 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -2 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -1 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 1 to 0
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -11 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -15 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -5 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -3 to 2
        rotation = 4
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -4 to 1
        rotation = 0
    }
    track {
        position = -11 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -13 to 2
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to 0)
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 1, 1 to 1, 2 to 0, 1 to 0, 0 to 0, -1 to 1)
    }
    track {
        position = 2 to 0
        positions = listOf(2 to 0, 1 to 0, 0 to 0, -1 to 0)
    }
    track {
        position = -15 to 0
        positions = listOf(-1 to 0, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                back()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                forward()
                extend()
                drop()
                wait(2)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                back()
                back()
                back()
                reset()
                wait(5)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                back()
                back()
                retract()
                wait(1)
                rotateCounterClockwise()
                forward()
                forward()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(3)
                extend()
                back()
                drop()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(11)
                grab()
                extend()
                reset()
                wait(8)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(13)
                grab()
                forward()
                forward()
                back()
                reset()
                wait(6)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(13)
                grab()
                back()
                back()
                wait(1)
                forward()
                reset()
                wait(5)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(25)
                grab()
                back()
                back()
                rotateClockwise()
                wait(1)
                back()
                reset()
                wait(4)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                back()
                back()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                back()
                drop()
                back()
                rotateClockwise()
                wait(1)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                rotateClockwise()
                back()
                reset()
                wait(4)
                grab()
                back()
                back()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                retract()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                wait(7)
                rotateCounterClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(17)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(5)
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                back()
                wait(5)
                back()
                reset()
                wait(2)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                back()
                wait(24)
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                retract()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                retract()
                pivotClockwise()
                rotateClockwise()
                retract()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
