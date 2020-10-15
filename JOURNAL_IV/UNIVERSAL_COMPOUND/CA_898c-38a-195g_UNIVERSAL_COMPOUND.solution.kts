
solution {
    puzzle = "P072"
    name = "B AA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 6 to -5
        rotation = 7
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 1 to -3
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = 6
    }
    glyph(ANIMISMUS) {
        position = 6 to -4
        rotation = 2
    }
    glyph(UNIFICATION) {
        position = 3 to -4
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 6 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 2
    }
    track {
        position = 4 to -5
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                extend()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                retract()
                rotateClockwise()
                extend()
                drop()
                retract()
                wait(19)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotClockwise()
                retract()
                pivotClockwise()
                retract()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                wait(5)
                extend()
                extend()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                extend()
                retract()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                retract()
                pivotClockwise()
                drop()
                extend()
                grab()
                retract()
                pivotClockwise()
                drop()
                wait(13)
                grab()
                pivotClockwise()
                drop()
                wait(7)
                grab()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                back()
                pivotClockwise()
                back()
                pivotClockwise()
                drop()
                retract()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                forward()
                extend()
                extend()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                retract()
                back()
                reset()
                wait(2)
                grab()
                retract()
                retract()
                drop()
                extend()
                grab()
                back()
                extend()
                drop()
                retract()
                retract()
                grab()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                extend()
                extend()
                reset()
                wait(5)
                grab()
                back()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(2)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                pivotClockwise()
                drop()
                retract()
                reset()
                wait(1)
                grab()
                back()
                drop()
                retract()
                rotateCounterClockwise()
                forward()
                back()
                grab()
                extend()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                back()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(20)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(15)
                rotateClockwise()
                wait(25)
                rotateClockwise()
                rotateClockwise()
                wait(8)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(69)
                reset()
            }
        }
        )
    }
}
