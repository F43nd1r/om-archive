
solution {
    puzzle = "P041"
    name = "B AA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -2 to 2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to 1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 3 to 0
        rotation = -2
    }
    glyph(DISPOSAL) {
        position = -1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(246)
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                extend()
                back()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                reset()
                wait(3)
                repeat()
                wait(29)
                repeat()
                wait(29)
                repeat()
                wait(29)
                grab()
                rotateCounterClockwise()
                extend()
                back()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                back()
                drop()
                extend()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                back()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                back()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                extend()
                rotateClockwise()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                back()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                extend()
                reset()
            }
        }
        )
    }
}
