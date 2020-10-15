
solution {
    puzzle = "P043"
    name = "W4.5"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 4 to 1
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 4 to -1
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -1 to 1
        rotation = 5
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 0 to 2
        rotation = -1
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = 1 to 2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 2 to 3
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 2 to 4
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -5 to -5
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -5
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to -5
        rotation = -3
    }
    glyph(DUPLICATION) {
        position = 4 to 0
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 2 to 0
        rotation = 2
    }
    glyph(ANIMISMUS) {
        position = 3 to -2
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 3
        position = -4 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = 2 to 2
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1, 2 to 2, 3 to 2, 4 to 2, 3 to 3)
    }
    track {
        position = -5 to -3
        positions = listOf(0 to -2, 0 to -1, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(7)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                wait(1)
                grab()
                extend()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(13)
                grab()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                extend()
                extend()
                grab()
                back()
                back()
                back()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                extend()
                wait(1)
                rotateClockwise()
                extend()
                back()
                retract()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                wait(2)
                back()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                wait(3)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                reset()
                wait(1)
                forward()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                extend()
                back()
                reset()
                wait(5)
                grab()
                extend()
                extend()
                drop()
                retract()
                wait(1)
                grab()
                back()
                wait(2)
                extend()
                drop()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                forward()
                forward()
                grab()
                extend()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                wait(6)
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                wait(2)
                forward()
                wait(3)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(13)
                grab()
                rotateClockwise()
                forward()
                retract()
                drop()
                retract()
                back()
                grab()
                extend()
                forward()
                back()
                pivotCounterClockwise()
                extend()
                forward()
                back()
                drop()
                retract()
                grab()
                forward()
                back()
                pivotClockwise()
                forward()
                drop()
                retract()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                back()
                reset()
                wait(2)
                repeat()
                wait(3)
                grab()
                back()
                reset()
            }
        }
        )
    }
}
